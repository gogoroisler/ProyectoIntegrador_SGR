import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-arg-prog-logo',
  templateUrl: './arg-prog-logo.component.html',
  styleUrls: ['./arg-prog-logo.component.css']
})
export class ArgProgLogoComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }
  login(){
    this.router.navigate(['/login']);
  }

}
