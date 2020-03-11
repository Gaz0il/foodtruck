export class Produit {
  id: number;
  libelle: string;
  prix: number;
  imageUrl: string;
  disponibilite: string;
  stock: number;
  composition: string;
  nombreVendu: number;
  avis: Avis[];
}

class Avis {
  idAvis: number;
  prixUser: number;
  commentaire: string;
  note: number;
}
