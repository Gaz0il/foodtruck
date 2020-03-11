#Adresse

INSERT INTO `foodtruck`.`adresse`
(`id`,
`code_postal`,
`is_active`,
`num_rue`,
`pays`,
`rue`)
VALUES
(<{id: 1}>,
<{code_postal: 42800}>,
<{is_active: True}>,
<{num_rue: 15}>,
<{pays: France}>,
<{rue: "rue de la Liberte"}>);

INSERT INTO `foodtruck`.`adresse`
(`id`,
`code_postal`,
`is_active`,
`num_rue`,
`pays`,
`rue`)
VALUES
(<{id: 2}>,
<{code_postal: 75400}>,
<{is_active: True}>,
<{num_rue: 6}>,
<{pays: France}>,
<{rue: "rue Georges"}>);

INSERT INTO `foodtruck`.`adresse`
(`id`,
`code_postal`,
`is_active`,
`num_rue`,
`pays`,
`rue`)
VALUES
(<{id: 3}>,
<{code_postal: 95004}>,
<{is_active: True}>,
<{num_rue: 5}>,
<{pays: France}>,
<{rue: "rue Michelet"}>);

#Avis
SELECT * FROM foodtruck.avis;INSERT INTO `foodtruck`.`avis`
(`id_avis`,
`commentaire`,
`note`,
`prix_user`,
`id_produit`,
`id_utilisateur`)
VALUES
(<{id_avis: }>,
<{commentaire: }>,
<{note: }>,
<{prix_user: }>,
<{id_produit: }>,
<{id_utilisateur: }>);
