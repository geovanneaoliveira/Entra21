import { Component, OnInit } from '@angular/core';

export type Hero = {
  id: number,
  heroName: string,
  secretIdentity?: string,
  universe: "marvel" | "DC",
  alive?: boolean
}

@Component({
  selector: 'app-heroes-screen',
  templateUrl: './heroes-screen.component.html',
  styleUrls: ['./heroes-screen.component.css']
})
export class HeroesScreenComponent implements OnInit {

  heroes: Hero[] = [
    {
      id: 1,
      heroName: "Iron man",
      universe: "marvel",
      secretIdentity: "Tony Stark",
      alive: false
    },
    {
      id: 2,
      heroName: "Super-man",
      universe: "DC",
    },
    {
      id: 3,
      heroName: "Doctor Strange",
      universe: "marvel",
      secretIdentity: "Stephen Strange",
    },
    {
      id: 4,
      heroName: "Scarlet Witch",
      universe: "marvel",
      secretIdentity: "Wanda Maximoff",
      alive: false
    },
    {
      id: 5,
      heroName: "Wonder Woman",
      universe: "DC",
    },
    {
      id: 6,
      heroName: "Black Widow",
      universe: "marvel",
      secretIdentity: "Natasha Romanoff",
      alive: false
    }
  ]

  constructor() { }

  ngOnInit(): void {
  }

}
