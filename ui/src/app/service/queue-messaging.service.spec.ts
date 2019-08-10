import { TestBed } from '@angular/core/testing';

import { QueueMessagingService } from './queue-messaging.service';

describe('QueueMessagingService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: QueueMessagingService = TestBed.get(QueueMessagingService);
    expect(service).toBeTruthy();
  });
});
