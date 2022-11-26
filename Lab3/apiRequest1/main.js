

// $(document).ready(function () {


	function busca() {
		debugger;


		$("#dadosEstado").empty();

		var url = " https://servicodados.ibge.gov.br/api/v1/localidades/estados/ ";

		$.getJSON(url, function (regiao) {
			console.log(regiao)

			//var regiao = [];
			$.each(regiao, function (i) {
				regiao.push("<tr> <td>" + this.id[i] + "</td><td>" + this.nome + "</td><td>" + this.sigla);
			});

			$("#dadosEstado").append(regiao);

		});

	};

	function buscaUsuario() {

		var vNome = $("#nomeUser").val();;
		// var vEmail = $("#emailUsuario").val();

		debugger;
		$.ajax({
			method: "POST",
			url: "https://servicodados.ibge.gov.br/api/v1/localidades/distritos?orderBy=nome",
			data: JSON.stringify({ nome: vNome }),
			contentType: "application/json; charset=utf-8",
			sucess: function (data) {
				alert("Sucesso!");
			}
		}).fail(function (xhr, status, errorThrow) {
			alert("Erro ao Salvar: " + xhr.responseText);
		});
	}





// });

