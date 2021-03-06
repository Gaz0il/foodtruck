export class Famillerepas {
  idFamilleRepas: number;
  produit: Produit[];
  libelle: string;
  actif: boolean;
}

interface Produit {
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

interface Avis {
  idAvis: number;
  prixUser: number;
  commentaire: string;
  note: number;
}
