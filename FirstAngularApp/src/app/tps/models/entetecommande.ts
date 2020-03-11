export class Entetecommande {
  idCommande: number;
  dateCommande: string;
  totalCommande: number;
  idAdresseLivraison: IdAdresseLivraison;
  idAdresseFacturation: IdAdresseLivraison;
  numFacturation: number;
  listeRepas: ListeRepas[];
  delivrer: boolean;
}

interface ListeRepas {
  idRepas: number;
  libelle: string;
  active: boolean;
}

interface IdAdresseLivraison {
  id: number;
  numRue: number;
  rue: string;
  codePostal: number;
  pays: string;
  ville: string;
  active: boolean;
}
