<!doctype html>
<html lang="fr">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

<title>Ajouter un collaborateur</title>
</head>

<body>
	<nav class="navbar navbar-expand-md navbar-light bg-light">
		<a class="navbar-brand" href="#"> <img
			src="" class="logo" />
		</a>
		<button class="navbar-toggler hidden-lg-up" type="button"
			data-toggle="collapse" data-target="#collapsibleNavId"
			aria-controls="collapsibleNavId" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavId">
			<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
				<li class="nav-item" id="menuCollab"><a class="nav-link"
					href="#">Collaborateurs <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item" id="menuStats"><a class="nav-link"
					href=#>Statistiques</a></li>
				<li class="nav-item" id="menuActivite"><a class="nav-link"
					href="#" active>Activités</a></li>
			</ul>
		</div>
	</nav>

	<div class="container-fluid">
		<h4>Nouveau Collaborateur</h4>
	</div>

	<div class="container">
		<form method="post" id="formCollab">
		
			<div class="form-group row">
				<label for="inputNom" class="col-form-label col-4">Nom</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputNom" name="inputNom" class="form-control" required>
					<div class="invalid-feedback">Le nom est obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputPrenom" class="col-form-label col-4">Prénom</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputPrenom" name="inputPrenom" class="form-control" required>
					<div class="invalid-feedback">Le prénom est obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputDate" class="col-form-label col-4">Date de
					naissance</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputDate" name="inputDate" class="form-control" required>
					<div class="invalid-feedback">La date de naissance est
						obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="textAdresse" class="col-form-label col-4">Adresse</label>
				<div class="col-8 pr-0">
					<textarea type="text" id="textAdresse" name="textAdresse" class="form-control"
						required></textarea>
					<div class="invalid-feedback">L'adresse est obligatoire.</div>
				</div>
			</div>

			<div class="form-group row">
				<label for="inputNoSecu" class="col-form-label col-4">Numéro
					de sécurité sociale</label>
				<div class="col-8 pr-0">
					<input type="text" id="inputNoSecu" name="inputNoSecu" class="form-control" required>
					<div class="invalid-feedback">Le numéro de sécurité sociale
						est obligatoire.</div>
				</div>
			</div>

			<div class="row">
				<div class="ml-auto">
					<button type="button" id="buttonCreer"
						class="btn btn-sm btn-success" data-toggle="modal"
						data-target="#modelId">Créer</button>
				</div>
			</div>

			<!-- Modal -->
			<div class="modal fade" id="modelId" tabindex="-1" role="dialog"
				aria-labelledby="modelTitleId" aria-hidden="true">
				<div class="modal-dialog" role="document">
					<div class="modal-content">
						<div class="modal-header">
							<h4 class="modal-title" id="modelTitleId">Création d'un
								collaborateur</h4>
						</div>
						<div class="modal-body">
							Vous êtes sur le point de créer un nouveau collaborateur : <br>
							<div class="row">
								<span class="col-8">Nom: </span> <span id="modalNom"
									class="col-4"></span>
							</div>

							<div class="row">
								<span class="col-8">Prénom: </span> <span id="modalPrenom"
									class="col-4"></span>
							</div>

							<div class="row">
								<span class="col-8">Date de naissance: </span> <span
									id="modalDate" class="col-4"></span>
							</div>

							<div class="row">
								<span class="col-8">Adresse: </span> <span id="modalAdresse"
									class="col-4"></span>
							</div>

							<div class="row">
								<span class="col-8">Numéro de sécurité sociale: </span> <span
									id="modalNoSecu" class="col-4"></span>
							</div>
						</div>
						<div class="modal-footer">
							<input type="submit" value="Confirmer" class="btn btn-primary">
							<button type="button" class="btn btn-secondary"
								data-dismiss="modal">Annuler</button>
						</div>
					</div>
				</div>
			</div>
		</form>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
		integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
		crossorigin="anonymous"></script>

<!-- 	<script src="./js/validation.js"></script>
	<script src="./js/modal.js"></script>

	<script>
        var url = $(location).attr("href");
        var args = url.split("?");
        if(args[1] == "errors")
        {
            $(".form-control").css("border-color", "#DC3545");
            $(".invalid-feedback").css("display", "block");
        }
    </script> -->
</body>

</html>