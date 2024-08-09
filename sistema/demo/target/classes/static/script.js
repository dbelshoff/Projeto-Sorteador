const selectedNumbers = [];

document.addEventListener("DOMContentLoaded", function () {
  const numbers = Array.from({ length: 50 }, (_, index) => index + 1);

  function updateSelectedNumbers() {
    const selectedNumbersElement =
      document.querySelector(".selected-numbers");
    selectedNumbersElement.innerHTML = "";

    selectedNumbers
      .sort((a, b) => a - b)
      .forEach((number) => {
        const numberElement = document.createElement("span");
        numberElement.className = "selected-number";
        numberElement.textContent = number;
        selectedNumbersElement.appendChild(numberElement);
      });
  }

  function selectNumber(number, element) {
    if (selectedNumbers.length < 5) {
      selectedNumbers.push(number);
      updateSelectedNumbers();
      element.classList.add("inactive");
      if (selectedNumbers.length === 5) {
        document.querySelectorAll(".number").forEach((el) => {
          el.classList.add("inactive");
        });
      }
    }
  }

  const numberSelectorElement =
    document.getElementById("number-selector");
  numbers.forEach((number) => {
    const numberElement = document.createElement("div");
    numberElement.className = "number";
    numberElement.textContent = number;
    numberElement.addEventListener("click", () => {
      if (!numberElement.classList.contains("inactive")) {
        selectNumber(number, numberElement);
      }
    });
    numberSelectorElement.appendChild(numberElement);
  });

  const phoneInput = document.getElementById("phone-input");
  phoneInput.addEventListener("input", function () {
    const phoneValue = this.value.replace(/\D/g, "");
    const formattedPhone = phoneValue.replace(
      /^(\d{2})(\d{5})(\d{4})$/,
      "($1) $2-$3"
    );
    this.value = formattedPhone;
  });

  $("#register-button").click(function () {
    saveData();
  });
});

function resetPage() {
  window.location.reload();
}

function saveData() {
  const userData = {
    name: document.getElementById("name-input").value,
    phone: document.getElementById("phone-input").value,
    selectedNumbers: selectedNumbers.sort((a, b) => a - b),
  };

  $.ajax({
    type: "POST",
    url: "/demo/saveData",
    contentType: "application/json",
    data: JSON.stringify(userData),
    success: function (response) {
      alert(response);
    },
    error: function (error) {
      alert("Erro ao salvar dados no servidor.");
      console.error(error);
    },
  });
}
