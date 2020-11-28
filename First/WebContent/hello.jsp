<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Javascript</title>
</head>
<body>
	<div class="container">
		<div class="search">
			<div class="wrapper">
				<input type="text" id="search"
					placeholder="Input content to search...">
				<button id="searchButton" type="submit">Search</button>
			</div>
			<div id="filter">
				<span>Filter Price: </span> <select name="filter-op" id="filter-btn">
					<option value="">Option</option>
					<option value="2000-3000">2000-3000</option>
					<option value="3000-5000">3000-5000</option>
					<option value="> 5000">> 5000</option>
				</select>
				<div id="sort">
					<span>Sort By: </span> <select name="sort" id="sort-btn">
						<option value="">Sort by</option>
						<option value="A->Z">A->Z</option>
						<option value="Z->A">Z->A</option>
						<option value="Price">Price</option>
					</select>
				</div>
			</div>
		</div>
		<ul id="content"></ul>
	</div>
</body>
</html>