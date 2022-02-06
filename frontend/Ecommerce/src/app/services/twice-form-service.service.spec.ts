import { TestBed } from '@angular/core/testing';

import { TwiceFormServiceService } from './twice-form-service.service';

describe('TwiceFormServiceService', () => {
  let service: TwiceFormServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(TwiceFormServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
