--/*
-- * Adresses
-- */
INSERT INTO `foodtruck`.`adresse`
(`id`,
`code_postal`,
`is_active`,
`num_rue`,
`pays`,
`rue`,
`ville`)
VALUES
(1,
42800,
true,
15,
"France",
"rue de la Liberte",
"Rive de Gier"),
(2,
75400,
true,
6,
"France",
"rue Georges",
"Paris"),
(3,
95004,
true,
5,
"France",
"rue Michelet",
"Paris");

/*
 * Genre
 */
INSERT INTO `foodtruck`.`genre`
(`id`,
`libelle`)
VALUES
(1,
"Mr."),
(2,
"Mme."),
(3,
"Autre");

--/*
-- * Profil
-- */
INSERT INTO `foodtruck`.`profil`
(`id`,
`libelle`)
VALUES
(1,
"Administrateur"),
(2,
"Utilisateur");

/*
* Famille Repas
*/
INSERT INTO `foodtruck`.`famille_repas`
(`id_famille_repas`,
`actif`,
`libelle`)
VALUES
(1,
true,
"Boissons Chaudes"),
(2,
true,
"Boissons Froides"),
(3,
true,
"Plats"),
(4,
true,
"Desserts"),
(5,
true,
"Viennoiseries");